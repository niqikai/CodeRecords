package com.example.springboot.file;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@Service
public class FileService {

    public void downLoad(String url, String saveDir, String filename) throws IOException, URISyntaxException {
//        FileUtils.copyURLToFile(new URL(url), new File(saveDir, filename));
        FileUtils.copyFileToDirectory(new File(new URI("")), new File(saveDir, filename));

    }

}
