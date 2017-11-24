char* intToCharArray(int num){
	int n = log10(num);
	char* arr = (char*) calloc(n + 1, sizeof(char));
	for (int i = n; i >= 0; --i, num /= 10)
	{
		arr[i] = (num % 10) + '0';
	}
	return arr;
}
