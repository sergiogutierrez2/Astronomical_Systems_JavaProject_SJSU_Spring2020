/**
 * This class holds the information of an Astronomical Body, its name and body
 */
public class AstronomicalBody {

    /**
     * Mass of the Body
     */
    private double mass;
    /**
     * Name of the Body.
     */
    private String name;

    /**
     * Constructor for AstronomicalBody that takes mass and name
     * @param mass, the mass of the Astronomical Body.
     * @param name, the name of the Astronomical Body.
     */
    public AstronomicalBody (double mass, String name)
    {
        this.mass = mass;
        this.name = name;
    }

    /**
     * Gets the mass of the Astronomical Body.
     * @return mass the mass of the body.
     */
    public double getMass()
    {
        return mass;
    }

    /**
     * Sets the mass of the Astronomical Body.
     * @param mass the mass of the Astronomical Body.
     */
    public void setMass(double mass)
    {
        this.mass = mass;
    }

    /**
     * Gets the name of the Astronomical Body.
     * @return the name of the Astronomical Body
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of the Astronomical Body.
     * @param name the name of the Astronomical Body.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Methods prints "Rotating around a star."
     */
    public void rotate()
    {
        System.out.println("Rotating around a star");
    }
}