
template<typename T>
void fillArray(T& arrayToFill, int numElements, ...) {
    va_list vl;
    double val;
    va_start(vl, numElements);
    for (int i = 0; i < numElements; i++) {
        val = va_arg(vl, double);
        arrayToFill[i] = val;
    }
}
