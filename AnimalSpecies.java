package animalspecies;

import java.util.Objects;

public class AnimalSpecies 
{
    String species_name;
    int population;
    float growthRate;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnimalSpecies other = (AnimalSpecies) obj;
        if (this.population != other.population) {
            return false;
        }
        if (Float.floatToIntBits(this.growthRate) != Float.floatToIntBits(other.growthRate)) {
            return false;
        }
        return Objects.equals(this.species_name, other.species_name);
    }

    public AnimalSpecies(String S_name,int p,float gRate)
    {
        species_name = S_name;
        population = p;
        growthRate = gRate;
    }
    public void changeSpeciesName(String s)
    {
        species_name = s;
    }
    public void changePopulation(int a)
    {
        population = a;
    }
    public void changeGrowthRate(float a)
    {
        growthRate = a;
    }
    @Override
    public String toString()
    {
        return "Name of Species = \t"+species_name+"\nPopulation = \t\t"+population+"\nGrowth Rate = \t\t"+growthRate;
    }
    public boolean endengared()
    {
        return growthRate<0;
    }
}
