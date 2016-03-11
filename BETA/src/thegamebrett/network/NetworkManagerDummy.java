package thegamebrett.network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;
import thegamebrett.Manager;
import thegamebrett.action.request.InteractionRequest;
import thegamebrett.action.response.InteractionResponse;

/**
 * Dummy zum Simulieren des Netzwerkmanagers (thegamebrett.network.Networkmanager)
 * 
 * @author Christian Colbach
 */
public class NetworkManagerDummy extends NetworkManager {
    
    /** Parameter 'clientManager' wird ignoriert */
    public NetworkManagerDummy(UserManager clientManager, Manager manager) {
        super(clientManager, manager);
        clientManager.systemClients[0] = new User(null, manager);
        clientManager.systemClients[1] = new User(null, manager);
        clientManager.systemClients[2] = new User(null, manager);
        clientManager.systemClients[3] = new User(null, manager);
    }
    
    public NetworkManagerDummy(Manager manager) {
        super(manager);
    }
    
    public void deliverMessage(InteractionRequest ir) throws PlayerNotRegisteredException {
        
        //int c = (Math.random() * ir.getChoices().length)
        int answer = (int)((Math.random()) * (ir.getChoices().length));
        InteractionResponse response = new InteractionResponse(ir, answer);
        
        if(ir.getPlayer() == null || ir.getPlayer().getUser() == null) {
            System.out.println("Request for unspecified User\n" + ir.getTitel());
        } else {
            System.out.println("Request for " + ir.getPlayer().getUser() + "\n" + ir.getTitel());
        }
        
        Timer timer = new Timer();
        timer.schedule( new TimerTask() {
            @Override
            public void run() {
                System.out.println("React responce="
                        + response.getConcerningInteractionRequest().getChoices()[answer]);
                manager.react(response);
            }
        }, (int)(1000 + Math.random() * 2000));
    }
    
}
