create table public.cliente (
   id                   SERIAL,
   nombre               VARCHAR(64),
   apellidos            VARCHAR(64),
   usuario              VARCHAR(64),
   password             VARCHAR(64),
   email                VARCHAR(64),
   constraint cliente_pkey primary key (id)
   )
   WITH (oids = false);

  