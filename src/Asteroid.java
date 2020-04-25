/**
 * Asteroid, a kind of Astronomical Body, with mass, and sometimes name.
 */
public class Asteroid extends AstronomicalBody {

    /**
     * Constructor for Asteroid passing Mass and Name
     * @param mass the mass of the Asteroid
     * @param name the name of the Asteroid
     */
    public Asteroid (double mass, String name)
    {
        super (mass, name);
    }

    /**
     * Constructor for Asteroids that only have mass, no name
     * @param mass the mass of the Asteroid
     */
    public Asteroid (double mass)
    {
        super (mass, "");
    }
}