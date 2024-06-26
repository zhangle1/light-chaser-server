package com.dagu.lightchaser.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dagu.lightchaser.entity.PageParamEntity;
import com.dagu.lightchaser.entity.ProjectEntity;

import java.util.List;

public interface ProjectService {
    Boolean updateProject(ProjectEntity project);

    String getProjectData(Long id);

    Long createProject(ProjectEntity project);

    Boolean deleteProject(Long id);

    Long copyProject(Long id);

    ProjectEntity getProjectInfo(Long id);

    String uploadCover(ProjectEntity project);

    Page<ProjectEntity> getProjectPageList(PageParamEntity pageParam);
}
