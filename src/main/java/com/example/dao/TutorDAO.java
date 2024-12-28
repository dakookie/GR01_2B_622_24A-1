package com.example.dao;

import com.example.model.Tutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TutorDAO {

    private final List<Tutor> tutores;

    public TutorDAO() {
        this.tutores = new ArrayList<>(); // Inicializa la lista de tutores
    }

    public void registrarTutor(Tutor tutor) {
        tutores.add(tutor); // Agrega el tutor a la lista
    }

    public void actualizarTutor(Tutor tutor) {
        for (int i = 0; i < tutores.size(); i++) {
            if (tutores.get(i).getId() == tutor.getId()) {
                tutores.set(i, tutor); // Reemplaza el tutor existente
                return;
            }
        }
    }


}
