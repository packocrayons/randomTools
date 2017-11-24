bool arrayEquals(char* array1, char* array2, int length){
	for (int i = 0; i < length; ++i)
	{
		if(array1[i] != array2[i]) return false;
	}
	return true;
}
