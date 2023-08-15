'''
 Variety-1

Problem Statement:

There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

Note: Start the array with positive elements.
'''
'''
variety-2
In this variety, the number of positive and negative numbers shall not necessarily be equal to each other in the given array. 
'''


#BruteForce Approach 
'''
def rearrange_by_sign(A):
    # Define 2 lists, one for storing positive and other for negative elements of the array.
    pos = []
    neg = []
  
    # Segregate the array into positives and negatives.
    for i in range(len(A)):
        if A[i] > 0:
            pos.append(A[i])
        else:
            neg.append(A[i])
  
    # Positives on even indices, negatives on odd.
    for i in range(len(pos)):
        A[2 * i] = pos[i]
    for i in range(len(neg)):
        A[2 * i + 1] = neg[i]
  
    return A

# Array Initialisation.
A = [1, 2, -4, -5]
ans = rearrange_by_sign(A)

for i in range(len(ans)):
    print(ans[i], end=" ")



'''


#variety 2

def RearrangebySign(A, n):
    # Define 2 lists, one for storing positive 
    # and other for negative elements of the array.
    pos = []
    neg = []
    
    # Segregate the array into positives and negatives.
    for i in range(n):
        if A[i] > 0:
            pos.append(A[i])
        else:
            neg.append(A[i])
    
    # If positives are lesser than the negatives.
    if len(pos) < len(neg):
        # First, fill array alternatively till the point 
        # where positives and negatives are equal in number.
        for i in range(len(pos)):
            A[2*i] = pos[i]
            A[2*i+1] = neg[i]
        
        # Fill the remaining negatives at the end of the array.
        index = len(pos)*2
        for i in range(len(neg)-len(pos)):
            A[index] = neg[len(pos)+i]
            index += 1
    
    # If negatives are lesser than the positives.
    else:
        # First, fill array alternatively till the point 
        # where positives and negatives are equal in number.
        for i in range(len(neg)):
            A[2*i] = pos[i]
            A[2*i+1] = neg[i]
        
        # Fill the remaining positives at the end of the array.
        index = len(neg)*2
        for i in range(len(pos)-len(neg)):
            A[index] = pos[len(neg)+i]
            index += 1
    
    return A

# Array initialization
n = 6
A = [1, 2, -4, -5, 3, 4]

ans = RearrangebySign(A, n)

for i in range(len(ans)):
    print(ans[i], end=" ")



