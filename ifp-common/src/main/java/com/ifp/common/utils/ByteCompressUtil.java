/*
 * Copyright 2018 www.n22.com.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this common except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ifp.common.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import com.ifp.common.exception.ToolException;

/**
 * 压缩byte数组的工具方法
 *
 * @author xman 2018-11-21
 */
public class ByteCompressUtil {

    /**
     * 使用gzip进行压缩
     *
     * @param source
     * @return
     */
    public static byte[] gzip(byte[] source) {
        if (source == null || source.length == 0) {
            return source;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(out);) {
            gzip.write(source);
        } catch (IOException e) {
            throw new ToolException(e);
        }
        return out.toByteArray();
    }

    /**
     * 使用gzip进行解压缩
     *
     * @param source
     * @return
     */
    public static byte[] unGzip(byte[] source) {
        if (source == null || source.length == 0) {
            return source;
        }
        int buffSize = 2048;
        ByteArrayInputStream in = new ByteArrayInputStream(source);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (GZIPInputStream gzipis = new GZIPInputStream(in, buffSize);) {
            byte[] buffer = new byte[buffSize];
            int length = -1;
            while ((length = gzipis.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new ToolException(e);
        }
        return out.toByteArray();
    }

    /**
     * 使用zip进行压缩
     *
     * @param source
     * @return
     */
    public static byte[] zip(byte[] source) {
        if (source == null || source.length == 0) {
            return source;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ZipOutputStream zip = new ZipOutputStream(out);) {
            zip.putNextEntry(new ZipEntry("0"));
            zip.write(source);
            zip.closeEntry();
        } catch (IOException e) {
            throw new ToolException(e);
        }
        return out.toByteArray();
    }

    /**
     * 使用zip进行解压缩
     *
     * @param source
     * @return
     */
    public static byte[] unZip(byte[] source) {
        if (source == null || source.length == 0) {
            return source;
        }
        int buffSize = 2048;
        ByteArrayInputStream in = new ByteArrayInputStream(source);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ZipInputStream zipis = new ZipInputStream(in);) {
            zipis.getNextEntry();
            byte[] buffer = new byte[buffSize];
            int length = -1;
            while ((length = zipis.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            throw new ToolException(e);
        }
        return out.toByteArray();
    }

}