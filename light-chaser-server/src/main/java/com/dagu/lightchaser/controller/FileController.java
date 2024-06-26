package com.dagu.lightchaser.controller;

import com.dagu.lightchaser.entity.FileEntity;
import com.dagu.lightchaser.global.ApiResponse;
import com.dagu.lightchaser.service.FileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/file")
public class FileController {

    @Resource
    private FileService fileService;

    @PostMapping(value = "/upload")
    public ApiResponse<String> uploadImage(FileEntity fileEntity) {
        return ApiResponse.success(fileService.uploadImage(fileEntity));
    }

    @GetMapping("/getList/{projectId}")
    public ApiResponse<List<FileEntity>> getSourceImageList(@PathVariable Long projectId) {
        return ApiResponse.success(fileService.getSourceImageList(projectId));
    }

    @GetMapping("/del/{id}")
    public ApiResponse<Boolean> delImageSource(@PathVariable Long id) {
        return ApiResponse.success(fileService.delImageSource(id));
    }
}
