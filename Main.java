public class Main {

    public static void main(String args[]) {
        String input = args[0]; 
        Playable playable = null;
        // Playable playable2 = new Football(); since Football --> Ball & Ball --> Playable , therefore Football --> Playable
        switch (input) {
            case "football":
                playable = new Football();
                break;
    
            case "basketball":
                playable = new Basketball();
                break;
            
            case "volleyball":
                playable = new Volleyball();
                break;
            
            case "flute":
                playable = new Flute();
                break;
            case "guitar":
                playable = new Guitar();
                break;
        
            case "violin":
                playable = new Violin();
                break;
            
        }
        play(playable); // perform play action for all different objects of different class
    }   
    
    public static void play (Playable playable)
    {
        playable.play();
        // playable.kick();
        if(playable instanceof Football) // in all other classes Play() has same action, except Football class that contains
        // kick() as well
        {
            Football football = (Football) playable; // Typecasting Playable to Footbal class structure; Unwrapping 
            football.kick(); 
        }
    }

    }
