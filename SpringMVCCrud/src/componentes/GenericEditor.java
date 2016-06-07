package componentes;

import java.beans.PropertyEditorSupport;

public class GenericEditor extends PropertyEditorSupport {
	
	private Class<?> objClass;
	public GenericEditor(Class<?> objClass) {
		super();
		this.objClass = objClass;
	}

	//@Override
	//public void setAsText(String text) throws IllegalArgumentException {
		//Dao dao = DaoFactory.getDao(objClass);
		//this.setValue(dao.getById(Integer.valueOf(text)));
	//}

	
	
}
