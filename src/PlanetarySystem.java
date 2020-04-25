import java.util.ArrayList;

/**
 * A Planetary System, with an ArrayList of Astronomical Bodies.
 */
public class PlanetarySystem extends ArrayList<AstronomicalBody> {

    /**
     * A Star
     */
    Star star;

    /**
     * This methods adds an Astronomical Body if it not an instance of Star, or
     * if it is an instance of a star AND it is null.
     * @param ab the Astornomical Body that may or may not be added to the ArrayList.
     * @return true or false, depending on whether the Astronomical Body was added or not to the ArrayList.
     */
    @Override
    public boolean add(AstronomicalBody ab)
    {
        if (!(ab instanceof Star))
        {
            super.add(ab);
            return true;
        }

        if (ab instanceof Star && star == null)
        {
            super.add(ab);
            star = (Star) ab;
            return true;
        }

        if (ab instanceof Star && star != null)
        {
            return false;
        }

        return false;
    }

    /**
     * Gets total Mass of Astronomical Bodies.
     * @return total the total of all masses of Astronomical Bodies.
     */
    public int getTotalMass()
    {
        int total=0;

        for(int i=0; i< this.size(); i++){

            total+=this.get(i).getMass();
        }
        return total;
    }

    /**
     * Methods overrides string method to provide a more specific description of the Astronomical Bodies.
     * @return st the string describing Astronomical Bodies
     */
    public String toString()
    {
        String st = "Astronomical Bodies:";

        for(int i = 0; i < this.size(); i++)
        {
            if ((this.get(i).getName()).equals(""))
            {
                st += "\n" + (i+1) + ". " + "No name. " + this.get(i).getName() + "Mass: " + this.get(i).getMass();
            }
            else
                st += "\n" + (i+1) + ". " + "Name: " + this.get(i).getName() + ", Mass: " + this.get(i).getMass();
        }
        st += "\n";
        return st;
    }

    /**
     * Method returns true if two PlanetarySystem objects have same stars, total masses, and sizes.
     * @param obj one of the objects being compared
     * @return true or false, of they are equal or not
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof PlanetarySystem)
        {
            PlanetarySystem other = (PlanetarySystem) obj;
            return this.star.equals(other.star)==true && this.getTotalMass()==other.getTotalMass()  && this.size()==other.size();
        }
        return false;
    }
}