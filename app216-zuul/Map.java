
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *   [Attic]
 *      |
 *  [Office]      [Lobby]<--->[RoomOne]
 *      |            |            |
 *  [RoomTwo]<-->[Lounge]     [Kitchen]
 *                                |
 *                            [Basement]    
 * @author Maciej Pinkowski
 * @version 2022-01-11
 */
public class Map
{
     // Need to add a list of exits
    
    private Location lobby, lounge, roomOne, roomTwo, attic, office, kitchen, basement;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createLobby();
        createLounge();
        createRoomTwo();
        createOffice();
        createAttic();
        createRoomOne();
        createKitchen();
        createBasement();

        currentLocation = lobby;  // start game in lobby
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createLobby()
    {
        lobby = new Location("outside the main entrance of the university");
        
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createRoomTwo()
    {
        roomTwo = new Location("in the campus pub");
        
        roomTwo.setExit("east", lounge);
        lounge.setExit("west", roomTwo);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createLounge()
    {
        lounge = new Location("in a lounge");
        
        lounge.setExit("north", lobby);
        lobby.setExit("south", lounge);
        
        lounge.setExit("east", roomTwo);
        roomTwo.setExit("west", lounge);
    }
       
    private void createOffice()
    {
        office = new Location("in an Office");
        
        office.setExit("south", roomTwo);
        roomTwo.setExit("north", office);        
    }
    
    private void createAttic()
    {
        attic = new Location("in the attic");
        
        attic.setExit("down", roomTwo);
        roomTwo.setExit("up", attic);
    }
    
    private void createRoomOne()
    {
        roomOne = new Location("in a room");
        
        roomOne.setExit("east", lobby);
        lobby.setExit("west", roomOne);
    }
    
    private void createKitchen()
    {
        kitchen = new Location("in a kitchen");
        
        kitchen.setExit("north", roomOne);
        roomOne.setExit("south", kitchen);
    }
    
    private void createBasement()
    {
        basement = new Location("in a basement");
        
        basement.setExit("up", kitchen);
        kitchen.setExit("down", basement);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
