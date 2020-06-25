package anahuerta.tfg.electronicsstorev3.persistence.component;

public interface ComponentRepositoryCustom {
	int getStockByReference(Integer reference);
		
	void updateStockByReference(Integer reference, int stock);
}
