package chat.chat;




import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.Arrays;
        import java.util.List;

@Controller
public class ChatApplication {

    @RequestMapping ("/rooms")
    public String showListRooms(Model model) {
        List<String> options = Arrays.asList("Tec", "Politics", "Java");
        model.addAttribute("options", options);
        return "rooms";
    }

    @RequestMapping ("/users")
    public String showListUsers(Model model) {
        List<String> options = Arrays.asList("Dani", "Nico", "Jordi");
        model.addAttribute("options", options);
        return "users";
    }







    public static void main(String[] args) {



    }
}

