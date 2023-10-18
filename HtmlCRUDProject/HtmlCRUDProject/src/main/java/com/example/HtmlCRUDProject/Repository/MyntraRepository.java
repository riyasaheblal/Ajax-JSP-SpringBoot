package com.example.HtmlCRUDProject.Repository;

import com.example.HtmlCRUDProject.Model.MyntraCloth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyntraRepository extends JpaRepository<MyntraCloth,Integer> {
}
