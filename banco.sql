use net_test;
create table campanha(id_campanha int not null AUTO_INCREMENT, nome_campanha varchar(50), 
						id_time int, vigencia_inicial Date, vigencia_final Date, PRIMARY KEY(id_campanha));
                        

insert into campanha values(0,'Teste00',0,'2020/01/01', '2020/01/10');
insert into campanha values(0,'Teste01',1,'2020/02/01', '2020/02/29');
insert into campanha values(0,'Teste02',2,'2020/02/01', '2020/02/27');
insert into campanha values(0,'Teste03',3,'2020/03/02', '2020/03/13');
insert into campanha values(0,'Teste04',4,'2020/03/02', '2020/03/20');
insert into campanha values(0,'Teste05',5,'2020/04/02', '2020/04/17');
insert into campanha values(0,'Teste05',6,'2020/9/02', '2020/09/15');


create table campanha_usuario (id_campanha int,id_cliente int, FOREIGN KEY(id_campanha) 
references campanha(id_campanha), foreign key(id_cliente) references cliente(id_cliente));


create table cliente(id_cliente int not null AUTO_INCREMENT, nome_completo varchar(50),email varchar(25), 
data_nascimento date, id_time_coracao int, PRIMARY KEY(id_cliente))

