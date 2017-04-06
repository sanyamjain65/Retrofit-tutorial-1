package mypocketvakil.example.com.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sanyam jain on 23-03-2017.
 */

class SingleUser {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
        @SerializedName("id")
        public Integer id;
        @SerializedName("name")
        public String name;
        @SerializedName("year")
        public Integer year;
        @SerializedName("pantone_value")
        public String pantone_value;
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getPantone_value() {
            return pantone_value;
        }

        public void setPantone_value(String pantone_value) {
            this.pantone_value = pantone_value;
        }
    }


}
