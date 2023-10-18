package com.example.HtmlCRUDProject.Service;

import com.example.HtmlCRUDProject.Model.MyntraCloth;
import com.example.HtmlCRUDProject.Repository.MyntraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyntraServiceImpl implements MyntraService {

    @Autowired
    private MyntraRepository myntraRepository;

    @Override
    public MyntraCloth create(MyntraCloth myntraCloth) {
        return this.myntraRepository.save(myntraCloth);
    }

    @Override
    public List<MyntraCloth> getAll() {
        return this.myntraRepository.findAll();
    }

    @Override
    public MyntraCloth findClothById(int id) {
        Optional<MyntraCloth> opt = myntraRepository.findById(id);
//        MyntraCloth myntraCloth = null;
//        if (opt.isPresent()) {
//            myntraCloth = opt.get();
//        } else {
//            throw new RuntimeException("Id is not present: " + id);
//        }
        return opt.isPresent() ? opt.get() :  new MyntraCloth();
    }

    @Override
    public MyntraCloth updateClothById(MyntraCloth myntraCloth, int id) {
        return null;
    }

    @Override
    public void deleteClothById(int id) {
    this.myntraRepository.deleteById(id);
    }
}
