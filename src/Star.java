/**
 * Star, a kind of Astronomical Body.
 */
public class Star extends AstronomicalBody {
    /**
     * Constructor for Astronomical Body passing its mass and name to its superclass
     * @param mass the mass of the star.
     * @param name the name of the star.
     */
    public Star (double mass, String name)
    {
        super (mass, name);
    }

    /**
     * Prints where the star is rotating.
     */
    @Override
    public void rotate()
    {
        System.out.println("Rotating around the center of a galaxy");
    }

    /**
     * Equals method has two Star objects being equal if their masses and name are equal
     * @param obj one of the objects being compared.
     * @return true or false, depending on whether the two objects were equal or not.
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Star)
        {
            Star other = (Star) obj;
            return this.getMass()== other.getMass() && this.getName().equals(other.getName());
        }
        return false;
    }
}