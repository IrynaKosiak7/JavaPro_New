package de.telran.lesson0703;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class City {
    private Integer id;
   private String name;
   private String countryCode;
   private String district;
   private Integer population;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }
}
