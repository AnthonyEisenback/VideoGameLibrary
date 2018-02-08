package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Game {

    private String name;
    private String dueDate;
    private Scanner scanner = new Scanner(System.in);
    private LocalDate today = LocalDate.now();
    private LocalDate threeDaysLater = today.plus(3, ChronoUnit.DAYS);

    public Game(String name) {
        this.name = name;
        dueDate = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDueDate() {
        float p2 = ChronoUnit.DAYS.between(today, threeDaysLater);
        System.out.println(p2);
        return dueDate;
    }

    public void setDueDate(String dueDate) {
      getDueDate();
    }
}
