import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers
{
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public @ResponseBody SuccessResponse createUser()
	{
		SuccessResponse response = new SuccessResponse();
		response.setSuccess( true );
		response.setMessage( "" );
		return response;
	}
}