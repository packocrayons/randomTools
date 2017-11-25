def calcC(mWater, mSodium, deltaT) :
	q = mWater * (4.184) * deltaT
	q = q/mSodium
	q = q * 136.08
	print(q)
