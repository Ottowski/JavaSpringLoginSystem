package com.example.individuellUppgift2.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FolderDTO {

    private String folderName;
    public Object getFolderName() {
        return folderName;
    }
}