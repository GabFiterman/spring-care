ALTER TABLE pacientes
ADD COLUMN ativo boolean DEFAULT TRUE;

UPDATE pacientes
SET
    ativo = TRUE;

ALTER TABLE pacientes
ALTER COLUMN ativo
SET
    NOT NULL;