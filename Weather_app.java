package weather_app;

import Windows.Menu;

/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;*/

public class Weather_app {
    /*private static EntityManagerFactory entityManagerFactory;    
        public static EntityManager getEntityManager() {
            if (entityManagerFactory == null) {
                entityManagerFactory = 
                    Persistence.createEntityManagerFactory("weatherAppPU");
            }
            return entityManagerFactory.createEntityManager();
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu.showMenu();
    }
    
}
