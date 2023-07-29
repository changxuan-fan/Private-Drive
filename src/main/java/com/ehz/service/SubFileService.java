package com.ehz.service;

import com.ehz.domain.File;
import com.ehz.domain.SubFile;
import com.ehz.domain.User;
import java.util.UUID;

public interface SubFileService {
  void createSubFile(
      String subFilePath,
      String filename,
      String fileType,
      String fileSize,
      boolean isDirectory,
      User uploadUser);

  SubFile findById(UUID uuid);

  SubFile findBySubFilePath(String subFilePath);

  SubFile findByFile(File file);

  // there is no need to create a separate deleteSubFile
  // void deleteSubFile(UUID subFileId);

}
