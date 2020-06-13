public class Principal {
    
    public static void main(String args[]) {
        
        System.out.print("\f");
        
        Cliente cliente = new Cliente();
        System.out.print("Client:");
        cliente.setCodigo(649732);
        cliente.setNome("Alexandro");
        cliente.setProfissao("Mecânico");
        System.out.println(cliente);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        System.out.print("\nPessoa Juridica:");
        pessoaJuridica.setCNPJ("213-7");
        pessoaJuridica.setRazaoSocial("Industria MecânicaLtda");
        pessoaJuridica.setInscricaoEstadual(017124306);
        pessoaJuridica.setCapitalInicial("12.000,50");
        System.out.println(pessoaJuridica);
        
        System.out.print("\nPessoa Fisica:");
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCPF("298.374.386-40");
        pessoaFisica.setEstadoCivil("Casado");
        pessoaFisica.setDataDeNascimento("29/08/1960");
        System.out.println(pessoaFisica);
        
    }

}
