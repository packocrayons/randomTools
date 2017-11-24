//copies an array from masterStart(inclusive) to masterEnd(exclusive)
void arrayCopy(char* master, char* slave, int masterStart, int masterEnd){
	for (int i = masterStart; i < masterEnd; ++i)
	{
		slave[i] = master[i];		
	}
}