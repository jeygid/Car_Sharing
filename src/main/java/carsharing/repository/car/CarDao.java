package carsharing.repository.car;

public interface CarDao {
    void createTable();

    void getCarList(int companyId);

    void addCar(String car, int companyId);
}
