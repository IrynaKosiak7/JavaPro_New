package de.telran.lesson0703;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Country {
    private String code;
    private String name;
    private Continent continent;
    private String Region;
    private double SurfaceArea;
    private int IndepYear;
    private int population;
    private double lifeExpectancy;
    private double GNP;
    private double GNPOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private int capital;
    private String code2;

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                "continent ='" + continent + '\'' +
                ", name='" + name + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
