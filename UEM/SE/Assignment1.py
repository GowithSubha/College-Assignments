''' to implement FPA method

In a system, total no. for each type FP is given as:
    i/p-&gt;60, file-&gt;25, query-&gt;35, i/f-&gt;20, o/p-&gt;25.The types of FP are simple, avg., complex.
    The no. ratio for each FP is like: i/p=1:6:3, file=1:2:2, query= avg., i/f= complex, o/p=2:2:1.
    The wt. factors for FP are resp. 0.5, 1.0, 1.5 for simple, avg. and complex types.
    The reliability and complexity of the system are 65% and 0.75 resp. Compute FP for the
    above system (UFP, TDI, VAF, AFP).
'''

# Input for simple, average, and complex FP values
simple =float (input("Enter sum value 5 fps of Simple fp:"))
avg =float (input("Enter sum value 5 fps of Average fp:"))
complex =float (input("Enter sum value 5 fps of Complex fp:"))

# Calculate Unadjusted Function Points (UFP)
UFP = 0.5*simple+1.0*avg+1.5*complex
print(f"After Computing UFP :{UFP:.2f}")

# Input for weight factors c1 and c2
c1 = float(input("Enter wt.factor1 for fp:"))
c2 = float(input("Enter wt.factor2 for fp:"))

# Calculate Technical Difficulty Indicator (TDI)
TDI =c1/100+c2
print(f"After Computing TDI :{TDI:.2f}")

# Calculate Value Adjustment Factor (VAF)
VAF = 0.01*TDI+0.65
print(f"After Computing VAF :{VAF:.2f}")

# Calculate Adjusted Function Points (AFP)
AFP = VAF*UFP
print(f"After Computing AFP :{AFP:.2f}")


