
#!/bin/bash

PASTA="organiz﻿ador/arquivos"

mkdir -p "$PASTA/documentos"
mkdir -p "$PASTA/imagens"
mkdir -p "$PASTA/textos"
mkdir -p "$PASTA/outros"

for arquivo in "$PASTA"/*; do
    [ -f "$arquivo" ] || continue

    nome=$(basename "$arquivo")
    extensao="${nome##*.}"

    case "${extensao,,}" in
        pdf|doc|docx|xls|xlsx|ppt|pptx)
            destino="$PASTA/documentos"
            ;;
        jpg|jpeg|png|gif|bmp|webp)
            destino="$PASTA/imagens"
            ;;
        txt|md|csv|log)
            destino="$PASTA/textos"
            ;;
        *)
            destino="$PASTA/outros"
            ;;
    esac

    mv -- "$arquivo" "$destino/"
    echo "Organizado: $nome"
done

echo "Organização concluída!"
