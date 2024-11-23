package com.iescamas.listadetareas_infolistview;

import java.io.Serializable;
//Serializo la clase para poder llevarme el objeto deseado al intent que quiera
public class TaskModel implements Serializable {

        private int image;
        private String nameTask;
        private String date;
        private String time;
        private String description;

        public TaskModel() {}

        public TaskModel(int image, String nameTask, String date, String time, String description) {
            this.image = image;
            this.nameTask = nameTask;
            this.date = date;
            this.time = time;
            this.description = description;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getNameTask() {
            return nameTask;
        }

        public void setNameTask(String nameTask) {
            this.nameTask = nameTask;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

