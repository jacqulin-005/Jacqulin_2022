package serialMultiplication;

class SerialMultiplier {
    int result;

    SerialMultiplier(int first) {
        result = first;       
    }
    
    SerialMultiplier(int first, int second) {
        result = first * second;
    }
    
    SerialMultiplier(int first, int second, int third) {
        result = first * second * third;
    }
    
    SerialMultiplier(int first, int second, int third, int fourth) {
        result = first * second * third * fourth;
    }
    
    SerialMultiplier(int first, int second, int third, int fourth, int fifth) {
        result = first * second * third * fourth * fifth;
    }

}
