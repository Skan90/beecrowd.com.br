# -*- coding: utf-8 -*-

while True:
	try:
		N = input()
	except(EOFError):
		break
	cont = 0
	cont2 = 9
	cont3 = 1
	B1 = 0
	B2 = 0
	B11 = 0
	B22 = 0
	while cont != 9:
		B1 = B1 + int(N[cont])*cont3
		B2 = B2 + int(N[cont])*cont2
		cont = cont + 1
		cont2 = cont2 - 1
		cont3 = cont3 + 1
	if B2%11 != 10:
		B22 = B2%11

	if B1%11 != 10:
		B11 = B1%11

	CPF = ""
	CPF = CPF + N[0]
	CPF = CPF + N[1]
	CPF = CPF + N[2]
	CPF = CPF + "."
	CPF = CPF + N[3]
	CPF = CPF + N[4]
	CPF = CPF + N[5]
	CPF = CPF + "."
	CPF = CPF + N[6]
	CPF = CPF + N[7]
	CPF = CPF + N[8]
	CPF = CPF + "-"
	CPF = CPF + str(B11)
	CPF = CPF + str(B22)
	print(CPF)