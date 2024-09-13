import random

def criar_lista_de_numeros():
    return set(range(1, 11))

def comecar_jogo():
    lista_de_numeros = criar_lista_de_numeros()

    while lista_de_numeros:
        print("-----------------------------------------------------------")
        print(f"É preciso tirar os números: {lista_de_numeros}")
        
        # Rolagem dos dados é feita apenas uma vez por rodada
        soma_dados = rolagem_dados()
        
        entrada_valida = False
        while not entrada_valida:
            entrada = input("Qual(is) número(s) gostaria de tirar? (Coloque os números separados por um espaço): ")
            numeros_escolhidos = numeros_escolhidos_func(entrada)
            soma = soma_dos_numeros_escolhidos(entrada)

            if soma == 0:
                print("Você desistiu do jogo!")
                lista_de_numeros.clear()  # Esvazia a lista para terminar o jogo
                break

            entrada_valida = True  # Assume que a entrada é válida, até que se prove o contrário

            if soma != soma_dados:
                print(f"A soma dos valores escolhidos não corresponde à soma dos dados. A soma dos dados foi: {soma_dados}")
                entrada_valida = False

            if not checagem_de_numeros_duplicados(numeros_escolhidos):
                print("Os valores escolhidos estão duplicados.")
                entrada_valida = False

            if not checagem_de_numero_na_lista(lista_de_numeros, numeros_escolhidos):
                print("Os valores escolhidos não podem ser retirados da lista.")
                entrada_valida = False

        # Se o jogador desistiu, sai do loop
        if soma == 0:
            break

        # Remover os números escolhidos da lista após entrada válida
        lista_de_numeros.difference_update(numeros_escolhidos)

    # Mensagem de vitória ou derrota
    if not lista_de_numeros and soma != 0:
        print("Parabéns, você ganhou!!!")
    elif soma != 0:
        print("Você perdeu :(")

    # Perguntar se o jogador deseja jogar novamente
    resposta = input("Deseja jogar novamente [S/N]: ")
    if resposta.lower() == 's':
        comecar_jogo()
    else:
        print("Obrigado por jogar! Até a próxima!")

def dado():
    return random.randint(1, 6)

def rolagem_dados():
    a = dado()
    b = dado()
    print(f"O primeiro dado rolou: {a}")
    print(f"O segundo dado rolou: {b}")
    print(f"A soma é: {a + b}")
    return a + b

def soma_dos_numeros_escolhidos(entrada):
    nums = entrada.split()
    soma = sum([int(num) for num in nums])
    return soma

def numeros_escolhidos_func(entrada):
    nums = entrada.split()
    return [int(num) for num in nums]

def checagem_de_numero_na_lista(lista_de_numeros, numeros_escolhidos):
    for numero in numeros_escolhidos:
        if numero not in lista_de_numeros:
            return False
    return True

def checagem_de_numeros_duplicados(numeros_escolhidos):
    return len(numeros_escolhidos) == len(set(numeros_escolhidos))

def regras():
    print("O objetivo desse jogo é tirar todos os números da lista.")
    print("Se utiliza os valores dos dados para isso, ou seja, caso a soma dos dados dê 4,")
    print("poderá tirar o 4 ou os números cuja soma dê 4, como o 1 e o 3.")
    print("Digite o número 0 caso não consiga mais tirar algum número")
    print("Boa Sorte!!")

if __name__ == "__main__":
    regras()
    comecar_jogo()
