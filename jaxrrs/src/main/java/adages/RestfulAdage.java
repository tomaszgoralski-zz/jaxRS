package adages;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import mykong.BookService;
import ets.AddList;

@ApplicationPath("/resourcesA")
public class RestfulAdage extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(Adages.class);
		set.add(AddList.class);
		set.add(BookService.class);
		return set;
	}
}