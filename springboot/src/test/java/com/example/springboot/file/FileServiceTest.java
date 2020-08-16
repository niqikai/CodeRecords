package com.example.springboot.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.EnumUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.*;

public class FileServiceTest {
    @Test
    public void test() throws URISyntaxException, IOException {
        String saveDir = "/Users/niqikai/Desktop";
        String filename = "test.pdf";
        File file = new File(saveDir, filename);

        FileUtils.copyURLToFile(new URL("https://nos.netease.com/edu-lesson-pdfsrc/7DAFAD296A17B6C0B2F58E4D6476E795-1554005435279?Signature=3B2SrppRpGmpwoC%2FVpIlZb19eMpmnWAYdPlQG4Qe8pg%3D&Expires=1597253595&NOSAccessKeyId=7ba71f968e4340f1ab476ecb300190fa&download=机器学习导论.pdf"),
                file);
//        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line = null;

        file.delete();
            System.out.println("qwerqwer");

    }
}