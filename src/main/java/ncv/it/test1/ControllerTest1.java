package ncv.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
public class ControllerTest1 {
    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String teerapat(){
        return "<center>This root page</center><br><a href='/name'>Go to name page</a>";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center>teerapat.</center><br><a href='/'>Go to name page</a>";
    }
    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "<center>0988139815 </center>";
    }
}
