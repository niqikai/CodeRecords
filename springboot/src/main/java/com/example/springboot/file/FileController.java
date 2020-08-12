package com.example.springboot.file;

import com.example.springboot.common.BizException;
import com.example.springboot.common.Code;
import com.example.springboot.common.Result;
import com.example.springboot.pojo.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
public class FileController {

    @PostMapping("upload")
    public Result upload(@RequestParam(value = "file", required = false) MultipartFile file, User user) {
        Object o = null;
//
        if (false) {
            throw new BizException(Code.METHOD_NOT_ALLOWED, "testgg");
        }
        System.out.println("world");
        return Result.ofSuccess("hello");
    }
}
