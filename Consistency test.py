def consistency_test(val1, val2, sigma1, sigma2) :
    t = abs((val1 - val2))/(sigma1 + sigma2)
    if t > 2 :
        print("Inconsistent, t = ", t)
    else :
        print("Consistent, t = ", t)
        
