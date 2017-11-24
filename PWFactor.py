def PWFactor( i, N, A, P, S ):
	(pow(1 + i, N) - 1)/(i*(pow(1 + i, N))) * A - P + S/(pow(1+i, N))
