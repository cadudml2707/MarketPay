import Layout from '../../components/layout/layout';

export function Venda(){
    return(
        <Layout>
            <div className='flex h-dvh w-screen p-10 bg-[#424b50]'>
                <h1 className='text-white font-bold text-2xl'>Bem-vindo(a) <span className='text-[#45cfef]'>Market</span><span className='text-[#d8fd12]'>Pay</span>!</h1>
            </div> 
        </Layout>
    );
}