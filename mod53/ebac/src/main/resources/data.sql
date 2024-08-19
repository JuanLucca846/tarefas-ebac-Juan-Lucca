INSERT INTO  Funcionario (nome) VALUES ('Juan');

INSERT INTO Animal (nome_provisorio,
                    idade_estimada,
                    especie,
                    raca,
                    data_entrada,
                    condicoes_chegada,
                    funcionario_id,
                    porte)
VALUES ('Rex',
        3,
        'Cachorro',
        'Labrador',
        CURRENT_DATE,
        'Sujo',
        1,
        'Grande');