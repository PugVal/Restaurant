package ru.projects.votingSystemProject.service;

import ru.projects.votingSystemProject.model.Meal;

import java.util.List;

public interface MealService {

    Meal get(int id);

    void delete(int id);

    List<Meal> getAll();

    Meal update(Meal meal);

    Meal create(Meal meal);
}