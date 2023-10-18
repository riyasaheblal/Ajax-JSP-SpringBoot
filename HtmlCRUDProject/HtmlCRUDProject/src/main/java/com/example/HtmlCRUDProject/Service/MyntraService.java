package com.example.HtmlCRUDProject.Service;

import com.example.HtmlCRUDProject.Model.MyntraCloth;

import java.util.List;

public interface MyntraService {

    public MyntraCloth create(MyntraCloth myntraCloth);
    List<MyntraCloth> getAll();
    MyntraCloth findClothById(int id);
    MyntraCloth updateClothById(MyntraCloth myntraCloth,int id);
    void deleteClothById(int id);

}
