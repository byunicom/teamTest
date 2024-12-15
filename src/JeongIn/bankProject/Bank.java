package bankProject;

public class Bank {

    Customer[] customerList = new Customer[100];
    int customerNum = 0;
    long accountNumTotal = 0;

    Bank() {}


    void addCustomer(String customerId, String customerName) {
        // 고객을 등록하고자 할 때, 기존 customerList의 공간이 없는 경우, 더 큰 공간의 배열을 생성후 고객 리스트를 옮김
        if(customerNum >= customerList.length) {
            Customer[] NewList = new Customer[customerList.length + 100];
            System.arraycopy(customerList,0, NewList, 0, customerList.length);
            customerList = NewList;
        }
        Customer newCustomer = new Customer(customerId, customerName);
        customerList[customerNum++] = newCustomer;
    }


    Customer findCustomer(String id) {
        for(int i = 0; i < customerNum; i++) {
            if(id.equals(customerList[i].customerId))
                return customerList[i];
        }
        return null;
    }

}
